SRC_URI_append = " https://proxy.golang.org/github.com/google/uuid/@v/v1.2.0.zip;srcoutput=github.com/google/uuid;srcinput=github.com/google/uuid@v1.2.0;downloadfilename=github-com-google-uuid-1.2.0.zip;name=github-com-google-uuid"
SRC_URI[github-com-google-uuid.sha256sum] = "6f9589bea19397e6f0cf22c46540538e9fad2f2b8a9d42358db66969b38b8d1c"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/google/uuid/LICENSE;md5=88073b6dd8ec00fe09da59e0b6dfded1 \
"
