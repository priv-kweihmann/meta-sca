SRC_URI += "git://github.com/shurcooL/httpgzip;branch=master;protocol=https;srcinput=github.com/shurcooL/httpgzip;srcoutput=github.com/shurcooL/httpgzip;destsuffix=github.com/shurcooL/httpgzip;name=github-com-shurcool-httpgzip"
SRCREV_github-com-shurcool-httpgzip = "320755c1c1b0484e6179c9a5b68aabcc0dae5ac2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/shurcooL/httpgzip/LICENSE;md5=8001472b946b576640e80322cc2e0726 \
"

GOSRC_INCLUDEGUARD += "github.com-shurcool-httpgzip-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
