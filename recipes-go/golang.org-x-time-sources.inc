SRC_URI += "https://proxy.golang.org/golang.org/x/time/@v/v0.0.0-20211116232009-f0f3c7e86c11.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.0.0-20211116232009-f0f3c7e86c11;downloadfilename=golang-org-x-time-0.0.0-20211116232009-f0f3c7e86c11.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "993c596b575e4c54a785ca02ffc187d2934b75906760e4ab0b37bd9fae23dfce"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-time-sources.inc"

