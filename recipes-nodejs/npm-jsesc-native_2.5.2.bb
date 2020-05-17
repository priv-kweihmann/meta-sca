SUMMARY = "NPM: jsesc"
DESCRIPTION = "Given some data, jsesc returns the shortest possible stringified & ASCII-safe representation of that data."
HOMEPAGE = "https://mths.be/jsesc"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

SRC_URI = "https://registry.npmjs.org/jsesc/-/jsesc-2.5.2.tgz"
SRC_URI[md5sum] = "73267fc7ff79ed59ec4c02cfb29d8a8b"
SRC_URI[sha256sum] = "ae5a2bdb55e44862273f1e08c3692f8da70ced96f0a4bb8294aa488ca58c258b"

NPM_PKGNAME = "jsesc"

inherit npmhelper
inherit native
