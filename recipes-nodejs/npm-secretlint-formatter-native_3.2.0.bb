SUMMARY = "NPM: @secretlint/formatter"
DESCRIPTION = "A formatter collection for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/formatter/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-chalk-native \
           npm-debug-native \
           npm-pluralize-native \
           npm-secretlint-types-native \
           npm-strip-ansi-native \
           npm-table-native \
           npm-terminal-link-native \
           npm-textlint-linter-formatter-native \
           npm-textlint-types-native \
           npm-try-resolve-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/formatter/-/formatter-3.2.0.tgz"
SRC_URI[md5sum] = "d63b68371475c4cdb8fe7faa9599085a"
SRC_URI[sha256sum] = "84a2ae9985f76e3b6dfdc1ee7bedc83aa1e2848716b8ba2b4ba36e7c140e6d26"

NPM_PKGNAME = "@secretlint/formatter"

inherit npmhelper
inherit native
