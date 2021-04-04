SRC_URI += "https://github.com/gomodule/redigo/archive/refs/tags/v1.8.4.zip;srcoutput=github.com/gomodule/redigo/redis;srcinput=redigo-1.8.4;downloadfilename=github-com-gomodule-redigo-redis-1.8.4.zip;name=github-com-gomodule-redigo-redis"
SRC_URI[github-com-gomodule-redigo-redis.sha256sum] = "5f7308025def1dc467727e5f9a3af5a69bc68249341a36b31deb38b2d0881879"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gomodule/redigo/redis/LICENSE;md5=2ee41112a44fe7014dce33e26468ba93 \
"

GOSRC_INCLUDEGUARD += "github.com-gomodule-redigo-redis-sources.inc"

