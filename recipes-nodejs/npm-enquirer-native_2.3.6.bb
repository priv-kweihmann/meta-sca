SUMMARY = "NPM: enquirer"
DESCRIPTION = "Stylish, intuitive and user-friendly prompt system. Fast and lightweight enough for small projects, powerful and extensible enough for the most advanced use cases."
HOMEPAGE = "https://github.com/enquirer/enquirer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62927f9e287cbc1dbddd9c8f208b7cdb"

DEPENDS = "npm-ansi-colors-native"

SRC_URI = "https://registry.npmjs.org/enquirer/-/enquirer-2.3.6.tgz"
SRC_URI[md5sum] = "503a9a34d2c8dcef4a1c4e621bf8a110"
SRC_URI[sha256sum] = "c882f81ad108f122c382925d4773040cb16264a684e6b241909cfbfd37b7b948"

NPM_PKGNAME = "enquirer"

inherit npmhelper
inherit native
