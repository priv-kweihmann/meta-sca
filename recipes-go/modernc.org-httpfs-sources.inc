SRC_URI += "https://proxy.golang.org/modernc.org/httpfs/@v/v1.0.6.zip;srcoutput=modernc.org/httpfs;srcinput=modernc.org/httpfs@v1.0.6;downloadfilename=modernc-org-httpfs-1.0.6.zip;name=modernc-org-httpfs"
SRC_URI[modernc-org-httpfs.sha256sum] = "0b5314649c1327a199397eb6fd52b3ce41c9d3bc6dd2a4dea565b5fb87c13f41"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/modernc.org/httpfs/LICENSE;md5=e3b294d03bddb1ce7ddb275602e4539a \
"

GOSRC_INCLUDEGUARD += "modernc.org-httpfs-sources.inc"

