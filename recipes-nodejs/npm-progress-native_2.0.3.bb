SUMMARY = "NPM: progress"
DESCRIPTION = "Flexible ascii progress bar"
HOMEPAGE = "https://github.com/visionmedia/node-progress#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ffa62cafbdaae1000b3aae767914db9b"

SRC_URI = "https://registry.npmjs.org/progress/-/progress-2.0.3.tgz"
SRC_URI[md5sum] = "d6db22bbf628b388829469a0bf0c21a5"
SRC_URI[sha256sum] = "701865e18ff6c0e3ba778756ddef8db1dc05c00a901babe57bc7a0a7e0e82aa4"

NPM_PKGNAME = "progress"

inherit npmhelper
inherit native
