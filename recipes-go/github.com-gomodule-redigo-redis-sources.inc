SRC_URI += "https://github.com/gomodule/redigo/archive/refs/tags/v1.8.6.zip;srcoutput=github.com/gomodule/redigo/redis;srcinput=redigo-1.8.6;downloadfilename=github-com-gomodule-redigo-redis-1.8.6.zip;name=github-com-gomodule-redigo-redis"
SRC_URI[github-com-gomodule-redigo-redis.sha256sum] = "21e2245fdec2e2e0be237354a929753c55b35f638d89660186cb2cc2f9eee4c7"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gomodule/redigo/redis/LICENSE;md5=2ee41112a44fe7014dce33e26468ba93 \
"

GOSRC_INCLUDEGUARD += "github.com-gomodule-redigo-redis-sources.inc"

