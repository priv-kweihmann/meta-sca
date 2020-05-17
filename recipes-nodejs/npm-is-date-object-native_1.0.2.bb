SUMMARY = "NPM: is-date-object"
DESCRIPTION = "Is this value a JS Date object? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/ljharb/is-date-object#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

SRC_URI = "https://registry.npmjs.org/is-date-object/-/is-date-object-1.0.2.tgz"
SRC_URI[md5sum] = "606c3c197ab2b532281c6dbed6e9d97e"
SRC_URI[sha256sum] = "305b0f5fe94161935fe4c77df330e997f6c8b20630dc515defd0295bd1a58382"

NPM_PKGNAME = "is-date-object"

inherit npmhelper
inherit native
