SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/buffalo/@v/v0.18.7.zip;srcoutput=github.com/gobuffalo/buffalo;srcinput=github.com/gobuffalo/buffalo@v0.18.7;downloadfilename=github-com-gobuffalo-buffalo-0.18.7.zip;name=github-com-gobuffalo-buffalo"
SRC_URI[github-com-gobuffalo-buffalo.sha256sum] = "0766a9fdce42a41621747ef5df698a4820b3ce4d0525e240c0f7cdd4be63b006"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/buffalo/LICENSE.txt;md5=85a1cdcf71593cf8d843001b33ab4265 \
    file://src/github.com/gobuffalo/buffalo/mail/internal/mail/LICENSE;md5=9e6777947389c7917571bdf8d11872bd \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-buffalo-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-burntsushi-toml-sources.inc', '', 'github.com-burntsushi-toml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-dustin-go-humanize-sources.inc', '', 'github.com-dustin-go-humanize-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-color-sources.inc', '', 'github.com-fatih-color-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-envy-sources.inc', '', 'github.com-gobuffalo-envy-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-events-sources.inc', '', 'github.com-gobuffalo-events-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-flect-sources.inc', '', 'github.com-gobuffalo-flect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-github-flavored-markdown-sources.inc', '', 'github.com-gobuffalo-github-flavored-markdown-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-helpers-sources.inc', '', 'github.com-gobuffalo-helpers-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-logger-sources.inc', '', 'github.com-gobuffalo-logger-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-meta-sources.inc', '', 'github.com-gobuffalo-meta-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-nulls-sources.inc', '', 'github.com-gobuffalo-nulls-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-plush-v4-sources.inc', '', 'github.com-gobuffalo-plush-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-pop-v6-sources.inc', '', 'github.com-gobuffalo-pop-v6-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-tags-v3-sources.inc', '', 'github.com-gobuffalo-tags-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gorilla-handlers-sources.inc', '', 'github.com-gorilla-handlers-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gorilla-mux-sources.inc', '', 'github.com-gorilla-mux-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gorilla-sessions-sources.inc', '', 'github.com-gorilla-sessions-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-karrick-godirwalk-sources.inc', '', 'github.com-karrick-godirwalk-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-markbates-grift-sources.inc', '', 'github.com-markbates-grift-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-markbates-oncer-sources.inc', '', 'github.com-markbates-oncer-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-markbates-refresh-sources.inc', '', 'github.com-markbates-refresh-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-markbates-safe-sources.inc', '', 'github.com-markbates-safe-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-monoculum-formam-sources.inc', '', 'github.com-monoculum-formam-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-cobra-sources.inc', '', 'github.com-spf13-cobra-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-alexcesaro-quotedprintable.v3-sources.inc', '', 'gopkg.in-alexcesaro-quotedprintable.v3-sources.inc', d)}
