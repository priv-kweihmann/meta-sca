SUMMARY = "NPM: is-callable"
DESCRIPTION = "Is this JS value callable? Works with Functions and GeneratorFunctions, despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/ljharb/is-callable#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-callable/-/is-callable-1.2.1.tgz"
SRC_URI[md5sum] = "45e65fcf0c295ba142ff96b1c7c2c736"
SRC_URI[sha256sum] = "e4373cd541e41271fcf06ec2ea4a1fb65bc46b1d28a2b8b8dd07abe35388a942"

NPM_PKGNAME = "is-callable"

inherit npmhelper
inherit native
