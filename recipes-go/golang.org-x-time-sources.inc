SRC_URI += "https://proxy.golang.org/golang.org/x/time/@v/v0.0.0-20220411224347-583f2d630306.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.0.0-20220411224347-583f2d630306;downloadfilename=golang-org-x-time-0.0.0-20220411224347-583f2d630306.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "12a6a6563b1d8b2924e0322e4bd117ee2f332c7dfb26ba4247f252bcc9af3610"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-time-sources.inc"

