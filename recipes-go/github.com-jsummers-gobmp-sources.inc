SRC_URI += "https://proxy.golang.org/github.com/jsummers/gobmp/@v/v0.0.0-20151104160322-e2ba15ffa76e.zip;srcoutput=github.com/jsummers/gobmp;srcinput=github.com/jsummers/gobmp@v0.0.0-20151104160322-e2ba15ffa76e;downloadfilename=github-com-jsummers-gobmp-0.0.0-20151104160322-e2ba15ffa76e.zip;name=github-com-jsummers-gobmp"
SRC_URI[github-com-jsummers-gobmp.sha256sum] = "e142254da53879079ac599aec157ced1fae5e59d3e0e754303f4f5a0219a9b9d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jsummers/gobmp/reader.go;md5=d38c283f71a6f803fe737123e019595e \
    file://src/github.com/jsummers/gobmp/readme.md;md5=ffadb74f9c3b70270759142e46dc0916 \
    file://src/github.com/jsummers/gobmp/rle.go;md5=46729da351a806477bf167f864b55778 \
    file://src/github.com/jsummers/gobmp/writer.go;md5=0206e6ec991caee516162bbd65a69dd2 \
"

GOSRC_INCLUDEGUARD += "github.com-jsummers-gobmp-sources.inc"

