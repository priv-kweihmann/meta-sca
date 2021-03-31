SRC_URI_append = " https://proxy.golang.org/github.com/kylelemons/godebug/@v/v1.1.0.zip;srcoutput=github.com/kylelemons/godebug;srcinput=github.com/kylelemons/godebug@v1.1.0;downloadfilename=github-com-kylelemons-godebug-1.1.0.zip;name=github-com-kylelemons-godebug"
SRC_URI[github-com-kylelemons-godebug.sha256sum] = "dbbd0ce8c2f4932bb03704d73026b21af12bd68d5b8f4798dbf10a487a2b6d13"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/kylelemons/godebug/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"
