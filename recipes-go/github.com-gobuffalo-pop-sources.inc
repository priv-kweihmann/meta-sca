SRC_URI += "git://github.com/gobuffalo/pop;nobranch=1;protocol=https;srcinput=github.com/gobuffalo/pop;srcoutput=github.com/gobuffalo/pop;destsuffix=github.com/gobuffalo/pop;name=github-com-gobuffalo-pop"
SRCREV_github-com-gobuffalo-pop = "33f2d5c4a214cb81adeaf4f8a84662dec29226b1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/pop/LICENSE.txt;md5=890c6789328dbe7f15a6e33bcbf1a58d \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-pop-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-color-sources.inc', '', 'github.com-fatih-color-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-sql-driver-mysql-sources.inc', '', 'github.com-go-sql-driver-mysql-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-attrs-sources.inc', '', 'github.com-gobuffalo-attrs-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-envy-sources.inc', '', 'github.com-gobuffalo-envy-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-fizz-sources.inc', '', 'github.com-gobuffalo-fizz-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-flect-sources.inc', '', 'github.com-gobuffalo-flect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-genny-v2-sources.inc', '', 'github.com-gobuffalo-genny-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-logger-sources.inc', '', 'github.com-gobuffalo-logger-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-nulls-sources.inc', '', 'github.com-gobuffalo-nulls-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-packd-sources.inc', '', 'github.com-gobuffalo-packd-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-packr-v2-sources.inc', '', 'github.com-gobuffalo-packr-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-plush-v4-sources.inc', '', 'github.com-gobuffalo-plush-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-validate-v3-sources.inc', '', 'github.com-gobuffalo-validate-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gofrs-uuid-sources.inc', '', 'github.com-gofrs-uuid-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackc-pgconn-sources.inc', '', 'github.com-jackc-pgconn-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackc-pgx-v4-sources.inc', '', 'github.com-jackc-pgx-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jmoiron-sqlx-sources.inc', '', 'github.com-jmoiron-sqlx-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lib-pq-sources.inc', '', 'github.com-lib-pq-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-luna-duclos-instrumentedsql-sources.inc', '', 'github.com-luna-duclos-instrumentedsql-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-sqlite3-sources.inc', '', 'github.com-mattn-go-sqlite3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-cobra-sources.inc', '', 'github.com-spf13-cobra-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
