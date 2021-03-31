SRC_URI_append = " https://proxy.golang.org/google.golang.org/api/@v/v0.43.0.zip;srcoutput=google.golang.org/api;srcinput=google.golang.org/api@v0.43.0;downloadfilename=google-golang-org-api-0.43.0.zip;name=google-golang-org-api"
SRC_URI[google-golang-org-api.sha256sum] = "d9663a584399a7eebd82bcdc458eca0378c9ef5d69904f5613a4a5972a983444"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/google.golang.org/api/LICENSE;md5=a651bb3d8b1c412632e28823bb432b40 \
    file://src/google.golang.org/api/internal/third_party/uritemplates/LICENSE;md5=4ee4feb2b545c2231749e5c54ace343e \
"
