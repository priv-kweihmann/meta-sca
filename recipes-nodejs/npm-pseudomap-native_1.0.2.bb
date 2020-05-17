SUMMARY = "NPM: pseudomap"
DESCRIPTION = "A thing that is a lot like ES6 `Map`, but without iterators, for use in environments where `for..of` syntax and `Map` are not available."
HOMEPAGE = "https://github.com/isaacs/pseudomap#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

SRC_URI = "https://registry.npmjs.org/pseudomap/-/pseudomap-1.0.2.tgz"
SRC_URI[md5sum] = "fd7eccafda1971d63ef558797d9b9916"
SRC_URI[sha256sum] = "07e9563487c9b0161412ec9d1dd2c3ae13c7b125040bbac4e0a99a38790b5b8e"

NPM_PKGNAME = "pseudomap"

inherit npmhelper
inherit native
