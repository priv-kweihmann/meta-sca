SUMMARY = "NPM: cspell-dict-bash"
DESCRIPTION = "Bash dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/bash#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-bash/-/cspell-dict-bash-1.1.4.tgz"
SRC_URI[md5sum] = "8788411549f9b76aaad5355f37de4458"
SRC_URI[sha256sum] = "8ead11d24ea8eb978d40475c16ca8d51f0dc21366f57b6da5b8dfb5001d5a0ed"

NPM_PKGNAME = "cspell-dict-bash"

inherit npmhelper
inherit native
