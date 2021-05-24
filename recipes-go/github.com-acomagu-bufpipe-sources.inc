SRC_URI += "git://github.com/acomagu/bufpipe;nobranch=1;protocol=https;srcinput=github.com/acomagu/bufpipe;srcoutput=github.com/acomagu/bufpipe;destsuffix=github.com/acomagu/bufpipe;name=github-com-acomagu-bufpipe"
SRCREV_github-com-acomagu-bufpipe = "2cfa345846425216dbbf1a8c31652b7ea379bf27"
UPSTREAM_CHECK_COMMITS = "1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/acomagu/bufpipe/LICENSE;md5=590159adecc5ab9bbc211374343ce99c \
"

GOSRC_INCLUDEGUARD += "github.com-acomagu-bufpipe-sources.inc"

