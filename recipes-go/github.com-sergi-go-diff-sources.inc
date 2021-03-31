SRC_URI_append = " https://proxy.golang.org/github.com/sergi/go-diff/@v/v1.2.0.zip;srcoutput=github.com/sergi/go-diff;srcinput=github.com/sergi/go-diff@v1.2.0;downloadfilename=github-com-sergi-go-diff-1.2.0.zip;name=github-com-sergi-go-diff"
SRC_URI[github-com-sergi-go-diff.sha256sum] = "da1accb73e9ac304a805eb59fba2c50d0089f9206a2574b8812af7e75e8ec105"

MOD_LICENSE_append = " \
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/sergi/go-diff/APACHE-LICENSE-2.0;md5=2ee41112a44fe7014dce33e26468ba93 \
    file://src/github.com/sergi/go-diff/LICENSE;md5=16f703825b70b736d741a46be315b0d9 \
"
