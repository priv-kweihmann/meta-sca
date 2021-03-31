SRC_URI_append = " https://proxy.golang.org/github.com/casbin/casbin/v2/@v/v2.25.5.zip;srcoutput=github.com/casbin/casbin/v2;srcinput=github.com/casbin/casbin/v2@v2.25.5;downloadfilename=github-com-casbin-casbin-v2-2.25.5.zip;name=github-com-casbin-casbin-v2"
SRC_URI[github-com-casbin-casbin-v2.sha256sum] = "454aa949f05ee4a4cec13a6ea0cb8c790dc76436cf20e1a4bf6d8cbd6810e1ab"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/casbin/casbin/v2/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"
