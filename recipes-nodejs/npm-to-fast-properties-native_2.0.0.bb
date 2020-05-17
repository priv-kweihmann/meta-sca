SUMMARY = "NPM: to-fast-properties"
DESCRIPTION = "Force V8 to use fast properties for an object"
HOMEPAGE = "https://github.com/sindresorhus/to-fast-properties#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a3b54a26fb11cf7129550e6ffc7807ea"

SRC_URI = "https://registry.npmjs.org/to-fast-properties/-/to-fast-properties-2.0.0.tgz"
SRC_URI[md5sum] = "ac0b1f7eef6a645d444e9ad835d1950a"
SRC_URI[sha256sum] = "c713fe48bc243fb0505dfc66f0c9fda8aec9c98c152b80cf44d459345f4e0983"

NPM_PKGNAME = "to-fast-properties"

inherit npmhelper
inherit native
