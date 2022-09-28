SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220927170352-d9d178bc13c6.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220927170352-d9d178bc13c6;downloadfilename=golang-org-x-sys-0.0.0-20220927170352-d9d178bc13c6.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "dc1f59206b8fdaddb432a5aa876fc519ceb8c96855885c84e97a2d92fe4ffa87"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

