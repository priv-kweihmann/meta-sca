SUMMARY = "NPM: flatted"
DESCRIPTION = "A super light and fast circular JSON parser."
HOMEPAGE = "https://github.com/WebReflection/flatted#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6e5d99ea62f60b0d450c3099eeff0bfd"

SRC_URI = "https://registry.npmjs.org/flatted/-/flatted-2.0.2.tgz"
SRC_URI[md5sum] = "db0b5cf7c700f5dc867916a7bfa7c548"
SRC_URI[sha256sum] = "10d10407f0078b627d9fa84c75a5c526287019aed778aa6c7aefc9f4745ee08d"

NPM_PKGNAME = "flatted"

inherit npmhelper
inherit native
