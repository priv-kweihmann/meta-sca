SUMMARY = "NPM: merge-stream"
DESCRIPTION = "Create a stream that emits events from multiple other streams"
HOMEPAGE = "https://github.com/grncdr/merge-stream#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b896e0cd5ef85a8c54bd2a7dd56e0e96"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/merge-stream/-/merge-stream-2.0.0.tgz"
SRC_URI[md5sum] = "b365290749b5fcacf5066cbc3bfdeb35"
SRC_URI[sha256sum] = "24c3be9bb27065e67519a480da43b251c8a0de6def1de79c3c22e96dd597764e"

NPM_PKGNAME = "merge-stream"

inherit npmhelper
inherit native
