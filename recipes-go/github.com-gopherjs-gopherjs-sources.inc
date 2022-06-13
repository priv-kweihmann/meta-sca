SRC_URI += "https://proxy.golang.org/github.com/gopherjs/gopherjs/@v/v1.17.2.zip;srcoutput=github.com/gopherjs/gopherjs;srcinput=github.com/gopherjs/gopherjs@v1.17.2;downloadfilename=github-com-gopherjs-gopherjs-1.17.2.zip;name=github-com-gopherjs-gopherjs"
SRC_URI[github-com-gopherjs-gopherjs.sha256sum] = "10a579f358ed01b90d8efa08878e7068b91bef929929f7c3532ffad3e20b7e67"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gopherjs/gopherjs/LICENSE;md5=fe493be43f9da268da17ebe5e4ff3947 \
"

GOSRC_INCLUDEGUARD += "github.com-gopherjs-gopherjs-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fsnotify-fsnotify-sources.inc', '', 'github.com-fsnotify-fsnotify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-neelance-astrewrite-sources.inc', '', 'github.com-neelance-astrewrite-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-neelance-sourcemap-sources.inc', '', 'github.com-neelance-sourcemap-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-shurcool-httpfs-sources.inc', '', 'github.com-shurcool-httpfs-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-cobra-sources.inc', '', 'github.com-spf13-cobra-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-pflag-sources.inc', '', 'github.com-spf13-pflag-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
