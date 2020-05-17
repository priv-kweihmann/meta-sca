SUMMARY = "NPM: callsites"
DESCRIPTION = "Get callsites from the V8 stack trace API"
HOMEPAGE = "https://github.com/sindresorhus/callsites#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/callsites/-/callsites-3.1.0.tgz"
SRC_URI[md5sum] = "37c0adb1138c0e1d64ae2eafc3bfeddf"
SRC_URI[sha256sum] = "170242bd32bf6e70c8521caeaa375209ce9585273d346ac6245aecbe84e3c89d"

NPM_PKGNAME = "callsites"

inherit npmhelper
inherit native
