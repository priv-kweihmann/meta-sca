SRC_URI += "https://proxy.golang.org/github.com/go-redis/redis/@v/v6.15.9+incompatible.zip;srcoutput=github.com/go-redis/redis;srcinput=github.com/go-redis/redis@v6.15.9+incompatible;downloadfilename=github-com-go-redis-redis-6.15.9+incompatible.zip;name=github-com-go-redis-redis"
SRC_URI[github-com-go-redis-redis.sha256sum] = "d3728839e2ea8b0d661d50dcf828da4b3f00ec735b3861e9402d1dce9d4b5f81"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-redis/redis/LICENSE;md5=58103aa5ea1ee9b7a369c9c4a95ef9b5 \
"

GOSRC_INCLUDEGUARD += "github.com-go-redis-redis-sources.inc"

