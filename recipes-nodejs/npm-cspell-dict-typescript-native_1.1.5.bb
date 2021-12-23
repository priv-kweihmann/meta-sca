SUMMARY = "NPM: cspell-dict-typescript"
DESCRIPTION = "TypeScript and JavaScript dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/typescript#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-typescript/-/cspell-dict-typescript-1.1.5.tgz"
SRC_URI[md5sum] = "f06c9afd0464b14700e6b19a435e4501"
SRC_URI[sha256sum] = "e2a1ae96f5b55aef4cdd183af2dc0c51ef03b618042892a82855e3d4159d6ba8"

NPM_PKGNAME = "cspell-dict-typescript"

inherit npmhelper
inherit native
