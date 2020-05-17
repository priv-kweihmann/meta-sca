SUMMARY = "NPM: @types/color-name"
DESCRIPTION = "TypeScript definitions for color-name"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

SRC_URI = "https://registry.npmjs.org/@types/color-name/-/color-name-1.1.1.tgz"
SRC_URI[md5sum] = "1513e971c589438d6d11f3da91478fee"
SRC_URI[sha256sum] = "e4354b0e6737e6154ae0910f39f4a7cbe6d13c52b74617da66ac116ef3acc161"

NPM_PKGNAME = "@types/color-name"

inherit npmhelper
inherit native

S = "${WORKDIR}/color-name"
