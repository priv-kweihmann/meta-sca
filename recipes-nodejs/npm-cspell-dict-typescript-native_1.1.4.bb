SUMMARY = "NPM: cspell-dict-typescript"
DESCRIPTION = "TypeScript and JavaScript dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/typescript#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-typescript/-/cspell-dict-typescript-1.1.4.tgz"
SRC_URI[md5sum] = "8bcba761ff748de20bb176d17caba50d"
SRC_URI[sha256sum] = "022c416434e8b3d11cbfefca323060fd50eb4e638323c3de925a8ed1fe7dfa74"

NPM_PKGNAME = "cspell-dict-typescript"

inherit npmhelper
inherit native
