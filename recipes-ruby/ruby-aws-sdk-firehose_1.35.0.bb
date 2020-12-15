SUMMARY = "RubyGem: aws-sdk-firehose"
DESCRIPTION = "Official AWS Ruby gem for Amazon Kinesis Firehose (Firehose)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "6727b5acf25f5c32de3160e25567dcb2"
SRC_URI[sha256sum] = "c83bbd687bc23274fa48c6ec49f9b3dfca5075b060ed2f3dd63e035e60508d79"

GEM_NAME = "aws-sdk-firehose"

inherit rubygems
