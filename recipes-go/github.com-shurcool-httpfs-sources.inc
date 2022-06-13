SRC_URI += "git://github.com/shurcooL/httpfs;branch=master;protocol=https;srcinput=github.com/shurcooL/httpfs;srcoutput=github.com/shurcooL/httpfs;destsuffix=github.com/shurcooL/httpfs;name=github-com-shurcool-httpfs"
SRCREV_github-com-shurcool-httpfs = "8d4bc4ba774931155e6cd5ef6098cb038dd45135"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/shurcooL/httpfs/LICENSE;md5=c670c44b8d826e9b7b99077e5c7ba283 \
"

GOSRC_INCLUDEGUARD += "github.com-shurcool-httpfs-sources.inc"

