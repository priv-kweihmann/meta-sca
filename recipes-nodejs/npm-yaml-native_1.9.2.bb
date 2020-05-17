SUMMARY = "NPM: yaml"
DESCRIPTION = "JavaScript parser and stringifier for YAML"
HOMEPAGE = "https://eemeli.org/yaml/"

DEPENDS = "npm-babel-runtime-native"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f43d95a153ee2ee3d2169246bae2f14b"

SRC_URI = "https://registry.npmjs.org/yaml/-/yaml-1.9.2.tgz"
SRC_URI[md5sum] = "eb90b9a6c9f349f890d9069c3a3b0967"
SRC_URI[sha256sum] = "de20da0c249f7126b0427b5f175f15eca98dad5f19e6ee80211482fdbeb77717"

NPM_PKGNAME = "yaml"

inherit npmhelper
inherit native
