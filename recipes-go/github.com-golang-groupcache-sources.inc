SRC_URI_append = " https://proxy.golang.org/github.com/golang/groupcache/@v/v0.0.0-20210331224755-41bb18bfe9da.zip;srcoutput=github.com/golang/groupcache;srcinput=github.com/golang/groupcache@v0.0.0-20210331224755-41bb18bfe9da;downloadfilename=github-com-golang-groupcache-0.0.0-20210331224755-41bb18bfe9da.zip;name=github-com-golang-groupcache"
SRC_URI[github-com-golang-groupcache.sha256sum] = "b27034e8fc013627543e1ad098cfc65329f2896df3da5cf3266cc9166f93f3a5"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/golang/groupcache/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
"
