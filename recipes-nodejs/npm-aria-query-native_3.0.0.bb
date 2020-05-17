SUMMARY = "NPM: aria-query"
DESCRIPTION = "Programmatic access to the ARIA specification"
HOMEPAGE = "https://github.com/A11yance/aria-query#readme"

DEPENDS = "npm-ast-types-flow-native npm-commander-native"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d92e60ee98664c54f68aa515a6169708"

SRC_URI = "https://registry.npmjs.org/aria-query/-/aria-query-3.0.0.tgz"
SRC_URI[md5sum] = "592f4c64dbbdd44a0a4b0f1404306723"
SRC_URI[sha256sum] = "33ed9f8f941eeb55356b1fd6046357131cbc9cce4dfb5ad8f3bff48b09dabac0"

NPM_PKGNAME = "aria-query"

inherit npmhelper
inherit native
