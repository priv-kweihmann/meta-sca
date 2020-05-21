SUMMARY = "NPM: dotfile-regex"
DESCRIPTION = "Regular expresson for matching dotfiles."
HOMEPAGE = "https://github.com/regexhq/dotfile-regex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f6db0829782d67e30695686ebb45970a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dotfile-regex/-/dotfile-regex-1.0.2.tgz"
SRC_URI[md5sum] = "09ac0d0b5ea78a87c3dc9c8a1e303d9b"
SRC_URI[sha256sum] = "f0578a091dc4c4f6f0dcc1539e3a7bbf84a280a6aa6a39d50f12b8532bf6c6bc"

NPM_PKGNAME = "dotfile-regex"

inherit npmhelper
inherit native
