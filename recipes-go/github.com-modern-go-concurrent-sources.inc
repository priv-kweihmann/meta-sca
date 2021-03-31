SRC_URI_append = " https://proxy.golang.org/github.com/modern-go/concurrent/@v/v0.0.0-20180306012644-bacd9c7ef1dd.zip;srcoutput=github.com/modern-go/concurrent;srcinput=github.com/modern-go/concurrent@v0.0.0-20180306012644-bacd9c7ef1dd;downloadfilename=github-com-modern-go-concurrent-0.0.0-20180306012644-bacd9c7ef1dd.zip;name=github-com-modern-go-concurrent"
SRC_URI[github-com-modern-go-concurrent.sha256sum] = "91ef49599bec459869d94ff3dec128871ab66bd2dfa61041f1e1169f9b4a8073"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/modern-go/concurrent/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"
