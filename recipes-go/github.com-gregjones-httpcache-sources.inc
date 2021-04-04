SRC_URI += "https://proxy.golang.org/github.com/gregjones/httpcache/@v/v0.0.0-20190611155906-901d90724c79.zip;srcoutput=github.com/gregjones/httpcache;srcinput=github.com/gregjones/httpcache@v0.0.0-20190611155906-901d90724c79;downloadfilename=github-com-gregjones-httpcache-0.0.0-20190611155906-901d90724c79.zip;name=github-com-gregjones-httpcache"
SRC_URI[github-com-gregjones-httpcache.sha256sum] = "73d773791d582cad0d90942e7d92f52d82f13119dd78e849bbd77fae2acc0276"
GOSRC_REMOVEDIRS += "github.com/gregjones/httpcache/redis"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gregjones/httpcache/LICENSE.txt;md5=3cfef421226b2dacde78a4871380ac24 \
"

GOSRC_INCLUDEGUARD += "github.com-gregjones-httpcache-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-bradfitz-gomemcache-sources.inc', '', 'github.com-bradfitz-gomemcache-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gomodule-redigo-redis-sources.inc', '', 'github.com-gomodule-redigo-redis-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-peterbourgon-diskv-sources.inc', '', 'github.com-peterbourgon-diskv-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-syndtr-goleveldb-sources.inc', '', 'github.com-syndtr-goleveldb-sources.inc', d)}
