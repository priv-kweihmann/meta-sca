SRC_URI += "https://proxy.golang.org/github.com/google/go-cmp/@v/v0.7.0.zip;srcoutput=github.com/google/go-cmp;srcinput=github.com/google/go-cmp@v0.7.0;downloadfilename=github-com-google-go-cmp-0.7.0.zip;name=github-com-google-go-cmp"
SRC_URI[github-com-google-go-cmp.sha256sum] = "64a9ce046f2c320e3783fba0d1f4a15f8a18f0b009b67bf27f7630919db3f539"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://github.com/google/go-cmp/LICENSE;md5=4ac66f7dea41d8d116cb7fb28aeff2ab \
"

GOSRC_INCLUDEGUARD += "github.com-google-go-cmp-sources.inc"

