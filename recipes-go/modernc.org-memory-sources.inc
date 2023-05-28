SRC_URI += "https://proxy.golang.org/modernc.org/memory/@v/v1.5.0.zip;srcoutput=modernc.org/memory;srcinput=modernc.org/memory@v1.5.0;downloadfilename=modernc-org-memory-1.5.0.zip;name=modernc-org-memory"
SRC_URI[modernc-org-memory.sha256sum] = "f79e8ada14c36d08817ee2bf6b2103f65c1a61a91b042b59016465869624043c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/modernc.org/memory/LICENSE-GO;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
    file://src/modernc.org/memory/LICENSE-MMAP-GO;md5=8c3f6072b212265c9f4b89a0c247b169 \
    file://src/modernc.org/memory/LICENSE;md5=c4dac399c2cb8794cc72e762c9f07263 \
"

GOSRC_INCLUDEGUARD += "modernc.org-memory-sources.inc"

