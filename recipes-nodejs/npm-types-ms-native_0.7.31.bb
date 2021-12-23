SUMMARY = "NPM: @types/ms"
DESCRIPTION = "TypeScript definitions for ms"
HOMEPAGE = "{homepage}"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/ms/-/ms-0.7.31.tgz"
SRC_URI[md5sum] = "07ae8c44c63a3eeb40f82891e6eed724"
SRC_URI[sha256sum] = "43c1f797421d639562755b038e9d4a6da1bd6de0ced4df16fcd3b293626d5836"

NPM_PKGNAME = "@types/ms"

inherit npmhelper
inherit native

S = "${WORKDIR}/ms"
