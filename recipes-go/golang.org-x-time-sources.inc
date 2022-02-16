SRC_URI += "https://proxy.golang.org/golang.org/x/time/@v/v0.0.0-20220210224613-90d013bbcef8.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.0.0-20220210224613-90d013bbcef8;downloadfilename=golang-org-x-time-0.0.0-20220210224613-90d013bbcef8.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "9ad5014467db2c38cc91c0d1cfbf2625b7e74cfa4ccafc18003b3fc14e081d3b"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-time-sources.inc"

