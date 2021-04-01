SRC_URI_append = " https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20210331142528-b7513248f0ba.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20210331142528-b7513248f0ba;downloadfilename=google-golang-org-genproto-0.0.0-20210331142528-b7513248f0ba.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "916af19dcbbbeac7b304075da5ab6e14409c1ac14077d336b0bec3ceaabee537"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/google.golang.org/genproto/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"
