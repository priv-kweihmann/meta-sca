SUMMARY = "NPM: cspell-dict-scala"
DESCRIPTION = "Scala dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/scala#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-scala/-/cspell-dict-scala-1.0.20.tgz"
SRC_URI[md5sum] = "a5937a49be9ede6cdb26b7791f1fd52e"
SRC_URI[sha256sum] = "add24a5e011e717b26055ae1ad895c2b10a01e7318f68910147a337f36b98c08"

NPM_PKGNAME = "cspell-dict-scala"

inherit npmhelper
inherit native
