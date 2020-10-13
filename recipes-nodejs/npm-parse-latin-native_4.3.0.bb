SUMMARY = "NPM: parse-latin"
DESCRIPTION = "Latin-script (natural language) parser"
HOMEPAGE = "https://github.com/wooorm/parse-latin#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=f94eeeb01d2350e09cda730abca93641"

DEPENDS = "npm-nlcst-to-string-native \
           npm-unist-util-modify-children-native \
           npm-unist-util-visit-children-native"

SRC_URI = "https://registry.npmjs.org/parse-latin/-/parse-latin-4.3.0.tgz"
SRC_URI[md5sum] = "5ca8dc6b9a19a81d18b895df2af4ce7c"
SRC_URI[sha256sum] = "4de44c7562470425bfffd0d8c1bc56301a5ef48452e50403f61360d57bdd3915"

NPM_PKGNAME = "parse-latin"

inherit npmhelper
inherit native
