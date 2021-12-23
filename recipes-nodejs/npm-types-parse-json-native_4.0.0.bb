SUMMARY = "NPM: @types/parse-json"
DESCRIPTION = "TypeScript definitions for parse-json"


DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

SRC_URI = "https://registry.npmjs.org/@types/parse-json/-/parse-json-4.0.0.tgz"
SRC_URI[md5sum] = "e873fb08737cf2677a4ee70f1092a701"
SRC_URI[sha256sum] = "ce9f5906409c193d9eb47f392a80adb1716c619bbed40f2edf4bafa582207631"

NPM_PKGNAME = "@types/parse-json"

inherit npmhelper
inherit native

S = "${WORKDIR}/parse-json"
