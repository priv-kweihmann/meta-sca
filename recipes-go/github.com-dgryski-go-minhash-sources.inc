SRC_URI += "https://proxy.golang.org/github.com/dgryski/go-minhash/@v/v0.0.0-20190315135803-ad340ca03076.zip;srcoutput=github.com/dgryski/go-minhash;srcinput=github.com/dgryski/go-minhash@v0.0.0-20190315135803-ad340ca03076;downloadfilename=github-com-dgryski-go-minhash-0.0.0-20190315135803-ad340ca03076.zip;name=github-com-dgryski-go-minhash"
SRC_URI[github-com-dgryski-go-minhash.sha256sum] = "3216a7340c8c2f28e7956c9cdf4f6553aef9df5875cbbdd7a822e385ef336862"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/dgryski/go-minhash/LICENSE;md5=8d2d978ca97b24091575e8dcd9e90d80 \
"

GOSRC_INCLUDEGUARD += "github.com-dgryski-go-minhash-sources.inc"

