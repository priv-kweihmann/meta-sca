SRC_URI_append = " https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20210330181207-2295ebbda0c6.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20210330181207-2295ebbda0c6;downloadfilename=google-golang-org-genproto-0.0.0-20210330181207-2295ebbda0c6.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "84128c92666a3f45ced08ba5d4c20e298114e7fa309e585381c418a97cf2c945"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/google.golang.org/genproto/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"
