SRC_URI += "git://github.com/gomodule/redigo;nobranch=1;protocol=https;srcinput=github.com/gomodule/redigo/redis;srcoutput=github.com/gomodule/redigo/redis;destsuffix=github.com/gomodule/redigo/redis;name=github-com-gomodule-redigo-redis"
SRCREV_github-com-gomodule-redigo-redis = "a83ebbeea6928a0236f332458532b8e978d51f11"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gomodule/redigo/redis/LICENSE;md5=2ee41112a44fe7014dce33e26468ba93 \
"

GOSRC_INCLUDEGUARD += "github.com-gomodule-redigo-redis-sources.inc"

