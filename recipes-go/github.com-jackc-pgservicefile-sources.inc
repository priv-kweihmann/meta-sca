SRC_URI += "https://proxy.golang.org/github.com/jackc/pgservicefile/@v/v0.0.0-20221227161230-091c0ba34f0a.zip;srcoutput=github.com/jackc/pgservicefile;srcinput=github.com/jackc/pgservicefile@v0.0.0-20221227161230-091c0ba34f0a;downloadfilename=github-com-jackc-pgservicefile-0.0.0-20221227161230-091c0ba34f0a.zip;name=github-com-jackc-pgservicefile"
SRC_URI[github-com-jackc-pgservicefile.sha256sum] = "1f8bdf75b2a0d750e56c2a94b1d1b0b5be4b29d6df056aebd997162c29bfd8ab"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackc/pgservicefile/LICENSE;md5=209ee38a480b3726bf58105857868aa4 \
"

GOSRC_INCLUDEGUARD += "github.com-jackc-pgservicefile-sources.inc"

