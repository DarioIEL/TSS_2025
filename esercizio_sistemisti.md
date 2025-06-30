# LABORATORIO: Gestione Utenti, Gruppi e Permessi in Linux

**Corso**: Sistemi Operativi Linux  
**Modulo**: Amministrazione Sistema  
**Tempo stimato**: 2-3 ore  
**Modalità**: Individuale

---

## SCENARIO

Sei stato assunto come amministratore di sistema presso **DevTech Solutions**, una software house che sviluppa applicazioni web. Il tuo primo compito è configurare il sistema Linux per il nuovo progetto "WebApp" creando gli utenti del team, organizzandoli in gruppi e impostando i permessi appropriati per garantire sicurezza e collaborazione efficace.

---

## TEAM DEL PROGETTO

Il team è composto da:

- **Alice Rossi** - Senior Developer (username: `alice`)
- **Bob Verdi** - Junior Developer (username: `bob`) 
- **Charlie Bianchi** - Full Stack Developer (username: `charlie`)
- **Diana Neri** - Project Manager (username: `diana`)
- **Eve Gialli** - Software Tester (username: `eve`)

---

## FASE 1: PREPARAZIONE AMBIENTE

### Compito 1.1: Creazione Utenti
Crea tutti gli utenti del team con le seguenti specifiche:
- Tutti devono avere una directory home
- Shell predefinita: `/bin/bash`
- Aggiungi il nome completo come commento

### Compito 1.2: Impostazione Password
Imposta una password per ogni utente (per il laboratorio usa password semplici come `password123`)

### Compito 1.3: Creazione Gruppi
Crea i seguenti gruppi:
- `developers` (per sviluppatori)
- `managers` (per project manager)
- `testers` (per tester)
- `webapp_team` (per tutto il team del progetto)

### Compito 1.4: Assegnazione Gruppi
Assegna ogni utente ai gruppi appropriati secondo il loro ruolo

**📝 Deliverable Fase 1:**
```bash
# Esegui questi comandi per verificare il tuo lavoro
id alice
id diana  
id eve
cat /etc/group | grep -E "(developers|managers|testers|webapp_team)"
```

---

## FASE 2: STRUTTURA PROGETTO

### Compito 2.1: Creazione Directory
Crea la seguente struttura sotto `/projects/`:

```
/projects/
├── webapp/
│   ├── src/          # Codice sorgente
│   ├── docs/         # Documentazione  
│   ├── tests/        # File di test
│   └── release/      # File di rilascio
├── shared/           # File condivisi team
└── management/       # File riservati management
```

### Compito 2.2: Creazione File di Test
Crea i seguenti file nelle rispettive directory:

**In `/projects/webapp/src/`:**
- `main.py` (file principale applicazione)
- `config.json` (configurazione - solo Alice può modificare)
- `database.sql` (script database - solo Bob può modificare)

**In `/projects/webapp/docs/`:**
- `README.md` (documentazione generale)
- `user_manual.pdf` (manuale utente)

**In `/projects/webapp/tests/`:**
- `test_suite.py` (suite di test)
- `test_results.log` (log dei risultati)

**In `/projects/webapp/release/`:**
- `webapp_v1.0.zip` (rilascio software)
- `release_notes.txt` (note di rilascio)

**In `/projects/shared/`:**
- `team_meeting.txt` (verbali riunioni)
- `project_timeline.txt` (timeline progetto)

**In `/projects/management/`:**
- `budget.xlsx` (budget progetto)
- `performance_review.txt` (valutazioni performance)

---

## FASE 3: CONFIGURAZIONE PERMESSI

### Compito 3.1: Permessi Directory Base

Imposta i permessi secondo questa matrice:

| Directory | Proprietario | Gruppo | Permessi | Chi può accedere |
|-----------|-------------|---------|----------|------------------|
| `/projects/webapp/src/` | root | `developers` | 770 | Solo sviluppatori (R/W/X) |
| `/projects/webapp/docs/` | root | `webapp_team` | 750 | Team legge, sviluppatori scrivono |
| `/projects/webapp/tests/` | root | `testers` | 770 | Solo tester (R/W/X) |
| `/projects/webapp/release/` | root | `managers` | 740 | Manager scrive, team legge |
| `/projects/shared/` | root | `webapp_team` | 770 | Tutto il team (R/W/X) |
| `/projects/management/` | root | `managers` | 700 | Solo manager |




## FASE 4: TESTING E VERIFICA

### Compito 4.1: Test di Accesso
Verifica che:

**Come Alice:**
- ✅ Può modificare `main.py` e `config.json`
- ✅ Può leggere la documentazione
- ❌ NON può accedere ai file di management
- ❌ NON può modificare file di test

**Come Diana:**
- ✅ Può modificare `README.md` e file di release
- ✅ Può accedere a tutti i file di management
- ✅ Può leggere tutto tranne file di test
- ❌ NON può modificare il codice sorgente

**Come Eve:**
- ✅ Può modificare file di test
- ✅ Può leggere documentazione e file condivisi
- ❌ NON può modificare codice sorgente
- ❌ NON può accedere a file di management

### Compito 4.2: Documentazione Test
Per ogni test, documenta:
- Comando eseguito
- Risultato ottenuto (successo/errore)
- Se il comportamento è quello atteso


## CONSEGNA

### Cosa consegnare:
1. **File di log** con tutti i comandi eseguiti
## RISORSE UTILI

### Comandi Principali:
```bash
# Gestione utenti
useradd, passwd, usermod, userdel

# Gestione gruppi  
groupadd, gpasswd, groups

# Gestione permessi
chmod, chown, chgrp

# Verifica
ls -l, id, stat
```

### Riferimenti Permessi:
- `r` (4) = Read
- `w` (2) = Write  
- `x` (1) = Execute
- Esempio: `rwxr-xr--` = 754

---

## NOTE IMPORTANTI

⚠️ **Attenzione**: Lavora sempre con privilegi sudo quando necessario  
⚠️ **Backup**: Prima di modifiche importanti, fai backup  
⚠️ **Sicurezza**: In ambiente reale usa password complesse  
⚠️ **Test**: Verifica sempre i permessi dopo le modifiche

---

**Buon lavoro! 🐧**
